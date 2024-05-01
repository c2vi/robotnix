
- the m command runs soong eventually
    - in the out/soong.log you see args passed to m
    - eg: `m hiiiiiiiiiiiiiii` produced ./hi-soong-log


- the build command wants to write to `out/target/product/FP4/test_harness_ramdisk/adb_debug.prop` with a shell redirection
	- this file is read only
	- i know excatly why it is like that: robotnix mounts the source from the nix-store, where it is read only ... and from there on it gets copied with cp and the readonly permission stays.....
	- so when developing don't even assume, that your source files are writeable....

- test_harness_ramdisk copies it from the debug-ramdisk
	- out/target/product/FP4/debug_ramdisk/adb_debug.prop
	- the cmd of this build step:
	```
	/bin/bash -c "rm -f out/target/product/FP4/debug_ramdisk/adb_debug.prop && cp -f -d out/soong/.intermediates/system/core/rootdir/adb_debug.prop/android_debug_ramdisk_arm64_armv8-a_cortex-a76/adb_debug.prop out/target/product/FP4/debug_ramdisk/adb_debug.prop"
	```
	- so here it is copied from: `out/soong/.intermediates/system/core/rootdir/adb_debug.prop/android_debug_ramdisk_arm64_armv8-a_cortex-a76/adb_debug.prop`

- all other relevant build commands
```
[5619/159734] /bin/bash -c "

(rm -f out/target/product/FP4/obj/ETC/adb_debug.prop_intermediates/adb_debug.prop ) && 
(cp \"out/soong/.intermediates/system/core/rootdir/adb_debug.prop/android_debug_ramdisk_arm64_armv8-a_cortex-a76/adb_debug.prop\" \"out/target/product/FP4/obj/ETC/adb_debug.prop_intermediates/adb_debug.prop\" )
(chmod u+w \ "out/target/product/FP4/obj/ETC/adb_debug.prop_intermediates/adb_debug.prop\" )"
```
- well there is a chmod u+w here, so out/target/product/FP4/obj/ETC/adb_debug.prop_intermediates/adb_debug.prop is writeable

```
5582/159734] rm -f out/soong/.intermediates/system/core/rootdir/adb_debug.prop/android_debug_ramdisk_arm64_armv8-a_cortex-a76/adb_debug.prop && 
cp -d  system/core/rootdir/adb_debug.prop out/soong/.intermediates/system/core/rootdir/adb_debug.prop/android_debug_ramdisk_arm64_armv8-a_cortex-a76/adb_debug.prop
```

- the src file that needs u+w permissions: system/core/rootdir/adb_debug.prop

- and info from robotnix docs: https://github.com/nix-community/robotnix/blob/ee5091bd96788c34f1edc6036f1a512a4e135eb9/docs/src/development.md?plain=1#L137

- so find the makefile
	- obviosly in: system/core/rootdir/Android.bp

# other info
```
robotnix-sysimg> PLATFORM_VERSION_CODENAME=REL
robotnix-sysimg> PLATFORM_VERSION=13
robotnix-sysimg> LINEAGE_VERSION=20.0-20240501-EXPERIMENTAL-FP4
robotnix-sysimg> TARGET_PRODUCT=lineage_FP4
robotnix-sysimg> TARGET_BUILD_VARIANT=userdebug
robotnix-sysimg> TARGET_BUILD_TYPE=release
robotnix-sysimg> TARGET_ARCH=arm64
robotnix-sysimg> TARGET_ARCH_VARIANT=armv8-a
robotnix-sysimg> TARGET_CPU_VARIANT=cortex-a76
robotnix-sysimg> TARGET_2ND_ARCH=arm
robotnix-sysimg> TARGET_2ND_ARCH_VARIANT=armv8-a
robotnix-sysimg> TARGET_2ND_CPU_VARIANT=cortex-a76
robotnix-sysimg> HOST_ARCH=x86_64
robotnix-sysimg> HOST_2ND_ARCH=x86
robotnix-sysimg> HOST_OS=linux
robotnix-sysimg> HOST_OS_EXTRA=Linux-6.5.11-7-pve-x86_64
robotnix-sysimg> HOST_CROSS_OS=windows
robotnix-sysimg> HOST_CROSS_ARCH=x86
robotnix-sysimg> HOST_CROSS_2ND_ARCH=x86_64
robotnix-sysimg> HOST_BUILD_TYPE=release
robotnix-sysimg> BUILD_ID=TQ3A.230901.001
robotnix-sysimg> OUT_DIR=out
robotnix-sysimg> PRODUCT_SOONG_NAMESPACES=vendor/fairphone/FP4 device/fairphone/FP4 vendor/qcom/opensource/usb/e
tc hardware/qcom-caf/sm8250 vendor/qcom/opensource/commonsys/display vendor/qcom/opensource/commonsys-intf/displ
ay vendor/qcom/opensource/display vendor/qcom/opensource/data-ipa-cfg-mgr-legacy-um vendor/qcom/opensource/datas
ervices

```