FAILED: build out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/installing_text.png
Outputs: out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/installing_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/installing_security_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/erasing_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/error_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/no_command_text.png
Error: exited with code: 1

Command: /bin/bash -c "
(rm -rf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates )
(mkdir -p out/target/product/FP4/obj/ETC/recovery_font_files_intermediates )

(cp external/noto-fonts/cjk/NotoSansCJK-Regular.ttc out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/cjk/NotoSerifCJK-Regular.ttc out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansAhom-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansAnatolianHieroglyphs-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBassaVah-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBhaiksuki-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansChakma-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansElbasan-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGunjalaGondi-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansHanifiRohingya-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansHatran-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansJavanese-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansKhojki-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLinearA-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansManichaean-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMarchen-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMasaramGondi-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMeroitic-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMiao-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMro-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMultani-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmar-Bold.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmar-Medium.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmar-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmarUI-Bold.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmarUI-Medium.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMyanmarUI-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansNabataean-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansNewa-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOldNorthArabian-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOldPermic-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansPahawhHmong-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansPalmyrene-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansPauCinHau-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSharada-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSoraSompeng-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTifinagh-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansWancho-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansWarangCiti-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifKhmer-Bold.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifKhmer-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifMyanmar-Bold.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifMyanmar-Regular.otf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoKufiArabic-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoKufiArabic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoNaskhArabic-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoNaskhArabic-Regular.ttf out/target/product/
FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoNaskhArabicUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoNaskhArabicUI-Regular.ttf out/target/pro
duct/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoNastaliqUrdu-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSans-Bold.ttf out/target/product/
FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSans-BoldItalic.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSans-Italic.ttf out/target/product/FP4/obj/
ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSans-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansAdlam-VF.ttf out/target/product/FP4/obj/ETC/recove
ry_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansAdlamUnjoined-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansArmenian-VF.ttf out/target/product/FP4/obj/ETC/
recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansAvestan-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBalinese-Regular.ttf out/target/product/FP4/obj
/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBamum-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBatak-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBengali-VF.ttf out/target/product/FP4/obj/ET
C/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBengaliUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBrahmi-Regular.ttf out/target/product/FP4/obj/ET
C/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBuginese-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansBuhid-Regular.ttf out/target/product/FP4/obj
/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCanadianAboriginal-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCarian-Regular.ttf out/target/p
roduct/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCham-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCham-Regular.ttf out/target/produc
t/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCherokee-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCoptic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCuneiform-Regular.ttf out/targe
t/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansCypriot-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansDeseret-Regular.ttf out/t
arget/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansDevanagari-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansDevanagariUI-VF.ttf out
/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansEgyptianHieroglyphs-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansEthiopi
c-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGeorgian-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGlagolitic-
Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGothic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGrant
ha-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGujarati-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGuj
arati-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGujaratiUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSa
nsGujaratiUI-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansGurmukhi-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/Not
oSansGurmukhiUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansHanunoo-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/N
otoSansHebrew-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansHebrew-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansImperialAramaic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-font
s/other/NotoSansInscriptionalPahlavi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansInscriptionalParthian-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermed
iates &&  cp external/noto-fonts/other/NotoSansKaithi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansKannada-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermedia
tes &&  cp external/noto-fonts/other/NotoSansKannadaUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansKayahLi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermedi
ates &&  cp external/noto-fonts/other/NotoSansKharoshthi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansKhmer-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_interme
diates &&  cp external/noto-fonts/other/NotoSansKhmer-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansKhmerUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermed
iates &&  cp external/noto-fonts/other/NotoSansKhmerUI-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLao-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLao-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates
 &&  cp external/noto-fonts/other/NotoSansLaoUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLaoUI-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&
  cp external/noto-fonts/other/NotoSansLepcha-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLimbu-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &
&  cp external/noto-fonts/other/NotoSansLinearB-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLisu-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates
&&  cp external/noto-fonts/other/NotoSansLycian-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansLydian-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediate
s &&  cp external/noto-fonts/other/NotoSansMalayalam-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMalayalamUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediate
s &&  cp external/noto-fonts/other/NotoSansMandaic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansMedefaidrin-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermedi
ates &&  cp external/noto-fonts/other/NotoSansMeeteiMayek-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansModi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_inte
rmediates &&  cp external/noto-fonts/other/NotoSansMongolian-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansNKo-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_in
termediates &&  cp external/noto-fonts/other/NotoSansNewTaiLue-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOgham-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOlChiki-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_fi
les_intermediates &&  cp external/noto-fonts/other/NotoSansOldItalic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOldPersian-Regular.ttf out/target/product/FP4/obj/ETC/recover
y_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOldSouthArabian-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOldTurkic-Regular.ttf out/target/product/FP4/o
bj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOriya-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOriya-Regular.ttf out/target/product/FP4/obj/
ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOriyaUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOriyaUI-Regular.ttf out/target/product/FP4/obj
/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOsage-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansOsmanya-Regular.ttf out/target/product/FP4/o
bj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansPhagsPa-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansPhoenician-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansRejang-Regular.ttf out/target/produ
ct/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansRunic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSamaritan-Regular.ttf out/target/p
roduct/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSaurashtra-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansShavian-Regular.ttf out/t
arget/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSinhala-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSinhalaUI-VF.ttf out/targe
t/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSoyombo-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSundanese-Regular.ttf out/targ
et/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSylotiNagri-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSymbols-Regular-Subs
etted.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSymbols-Regular-Subsetted2.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/Not
oSansSymbols-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSyriacEastern-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts
/other/NotoSansSyriacEstrangela-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansSyriacWestern-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp
external/noto-fonts/other/NotoSansTagalog-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTagbanwa-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&
  cp external/noto-fonts/other/NotoSansTaiLe-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTaiTham-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTaiViet-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediate
s &&  cp external/noto-fonts/other/NotoSansTakri-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTamil-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp e
xternal/noto-fonts/other/NotoSansTamilUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansTelugu-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external
/noto-fonts/other/NotoSansTeluguUI-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansThaana-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/not
o-fonts/other/NotoSansThaana-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansThai-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-f
onts/other/NotoSansThai-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansThaiUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-font
s/other/NotoSansThaiUI-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansUI-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/oth
er/NotoSansUI-BoldItalic.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansUI-Italic.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansUI-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/Noto
SansUgaritic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSansVai-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/Not
oSansYi-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerif-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerif-Bol
dItalic.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerif-Italic.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerif-Regular.t
tf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifArmenian-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifBengali-VF.ttf
out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifDevanagari-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifDogra-Regular.tt
f out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifEthiopic-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifGeorgian-VF.ttf
out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifGujarati-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifGurmukhi-VF.ttf ou
t/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifHebrew-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifHebrew-Regular.ttf o
ut/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifKannada-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifLao-Bold.ttf out/tar
get/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifLao-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifMalayalam-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifNyiakengPuachueHmong-VF.t
tf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifSinhala-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifTamil-VF.ttf out
/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifTelugu-VF.ttf out/ta
rget/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifThai-Bold.ttf out/targe
t/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifThai-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifTibetan-VF.ttf out/target/
product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifYezidi-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/roboto-fonts/Roboto-Regular.ttf out/target/product/FP4/ob
j/ETC/recovery_font_files_intermediates &&  cp external/roboto-fonts/RobotoStatic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates && true )

(rm -rf out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/ )
(mkdir -p out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/ )




(
java 
-jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_installing 
--font_dir out/target/product/FP4/o-fonts/other/NotoSerifLao-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates

&&  cp external/noto-fonts/other/NotoSerifMalayalam-VF.ttf out/target/product/FP4/obj/E
TC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifNyiakengPuachueHmong-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/not
o-fonts/other/NotoSerifSinhala-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifTamil-VF.ttf out/target/product/FP4/obj/ETC/re
covery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifTelugu-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoS
erifThai-Bold.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifThai-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_file
s_intermediates &&  cp external/noto-fonts/other/NotoSerifTibetan-VF.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/noto-fonts/other/NotoSerifYezidi-VF.t
tf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp external/roboto-fonts/Roboto-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates &&  cp ext
ernal/roboto-fonts/RobotoStatic-Regular.ttf out/target/product/FP4/obj/ETC/recovery_font_files_intermediates
&& true )





(rm -rf out/target/product/FP4/obj/ETC/recovery_text_res_intermediate
s/ )
(mkdir -p out/target/product/FP4/obj/ETC/recovery_text_res_intermediates/ )

(
java 
-jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_installing 
--font_dir out/target/product/FP4/obj/ETC/recovery_font_files_intermediates 
--resource_dir bootable/recovery/tools/recovery_l10n/res/
--output_file out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_text.png 
--center_alignment

&& out/host/linux-x86/bin/zopflipng 
-y 
--iterations=1 
--filters=0 out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_text.png
> /dev/null && 

java 
-jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_installing_security 
--font_dir out/target/product/FP4/obj/ETC/recovery_font_files_intermediates 
--resource_dir bootable/recovery/tools/recovery_l10n/res/ 
--output_file out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_security_text.png 
--center_alignment

&& out/host/linux-x86/bin/zopflipng 
-y 
--iterations=1 
--filters=0 out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_security_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//installing_security_text.png
> /dev/null &&    

java -jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_erasing 
--font_dir out/target/product/FP4/obj/ETC/recovery_font_files_intermediates 
--resource_dir bootable/recovery/tools/recovery_l10n/res/ 
--output_file out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//erasing_text.png 
--center_alignment && out/host/linux-x86/bin/zopflipng 
-y 
--iterations=1 
--filters=0 out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//erasing_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//erasing_text.png
> /dev/null &&    

java -jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_error 
--font_dir out/target/product/FP4/obj/ETC/recovery_font_files_intermediates 
--resource_dir bootable/recovery/tools/recovery_l10n/res/ 
--output_file out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//error_text.png 
--center_alignment && out/host/linux-x86/bin/zopflipng 
-y 
--iterations=1 
--filters=0 out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//error_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//error_text.png 
> /dev/null &&    

java -jar out/host/linux-x86/framework/RecoveryImageGenerator.jar 
--image_width \$((1080 - 10 - 10)) 
--text_name recovery_no_command 
--font_dir out/target/product/FP4/obj/ETC/recovery_font_files_intermediates 
--resource_dir bootable/recovery/tools/recovery_l10n/res/ 
--output_file out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//no_command_text.png 
--center_alignment && out/host/linux-x86/bin/zopflipng -y 
--iterations=1 
--filters=0 out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//no_command_text.png out/target/product/FP4/obj/ETC/recovery_text_res_intermediates//no_command_text.png
> /dev/null && true )
"


# java error
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
        at java.desktop/sun.font.FontManagerFactory$1.run(FontManagerFactory.java:84)
        ... 8 more
Caused by: java.lang.NullPointerException
        at java.desktop/sun.awt.FontConfiguration.getVersion(FontConfiguration.java:1262)
        at java.desktop/sun.awt.FontConfiguration.readFontConfigFile(FontConfiguration.java:225)
        at java.desktop/sun.awt.FontConfiguration.init(FontConfiguration.java:107)
        at java.desktop/sun.awt.X11FontManager.createFontConfiguration(X11FontManager.java:719)
        at java.desktop/sun.font.SunFontManager$2.run(SunFontManager.java:379)
        at java.base/java.security.AccessController.doPrivileged(Native Method)
        at java.desktop/sun.font.SunFontManager.<init>(SunFontManager.java:324)
        at java.desktop/sun.awt.FcFontManager.<init>(FcFontManager.java:35)
        at java.desktop/sun.awt.X11FontManager.<init>(X11FontManager.java:56)
        ... 13 more



# full java error
Exception in thread "main" java.lang.InternalError: java.lang.reflect.InvocationTargetException
        at java.desktop/sun.font.FontManagerFactory$1.run(FontManagerFactory.java:86)
        at java.base/java.security.AccessController.doPrivileged(Native Method)
        at java.desktop/sun.font.FontManagerFactory.getInstance(FontManagerFactory.java:74)
        at java.desktop/java.awt.Font.<init>(Font.java:619)
        at java.desktop/java.awt.Font.createFont(Font.java:1225)
        at com.android.recovery.tools.ImageGenerator.loadFontsByLocale(ImageGenerator.java:393)
        at com.android.recovery.tools.ImageGenerator.createGraphics(ImageGenerator.java:492)
        at com.android.recovery.tools.ImageGenerator.generateImage(ImageGenerator.java:605)
        at com.android.recovery.tools.ImageGenerator.main(ImageGenerator.java:756)
Caused by: java.lang.reflect.InvocationTargetException
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
        at java.desktop/sun.font.FontManagerFactory$1.run(FontManagerFactory.java:84)
        ... 8 more
Caused by: java.lang.NullPointerException
        at java.desktop/sun.awt.FontConfiguration.getVersion(FontConfiguration.java:1262)
        at java.desktop/sun.awt.FontConfiguration.readFontConfigFile(FontConfiguration.java:225)
        at java.desktop/sun.awt.FontConfiguration.init(FontConfiguration.java:107)
        at java.desktop/sun.awt.X11FontManager.createFontConfiguration(X11FontManager.java:719)
        at java.desktop/sun.font.SunFontManager$2.run(SunFontManager.java:379)
        at java.base/java.security.AccessController.doPrivileged(Native Method)
        at java.desktop/sun.font.SunFontManager.<init>(SunFontManager.java:324)
        at java.desktop/sun.awt.FcFontManager.<init>(FcFontManager.java:35)
        at java.desktop/sun.awt.X11FontManager.<init>(X11FontManager.java:56)
        ... 13 more
