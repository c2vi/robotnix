## reproduce
- nix build github:c2vi/nixos/a5554e71cd8b328050f5becb915400d5edc990ac#robotnixConfigurations.test.config.build.debugEnterEnv --option max-call-depth 1000000
- cd to an empty folder
- ./result
- start android build
- lunch lunch lineage_FP4-userdebug
	- see: [[AOSP Building]]
- m

- don't search for InvocationTargetException and Font, but for NullPointerException + Font ... because the InvocationTargetException is only caused because something is called throuch [[Java Reflections]]

- same issue: https://github.com/AdoptOpenJDK/openjdk-docker/issues/560
	- https://github.com/AdoptOpenJDK/openjdk-docker/issues/75
	- https://github.com/docker-library/openjdk/issues/46

- so what is [[Fontconfig (linux building)]]

- ./test.java fails in the robotnix chroot, but not in a normal linux env

- issue reproduced in alpine
	- podman run --rm -it adoptopenjdk/openjdk11:alpine /bin/sh
	- apk add fontconfig
	- java test.java

- solution: https://github.com/adoptium/temurin-build/issues/693#issuecomment-439983961
	- my java home: /root/sebi/robotnix/phone-build/prebuilts/jdk/jdk11/linux-x86/
	- rel: [[Java Home]]

