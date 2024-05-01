import java.awt.Font;
import java.io.File;
import java.awt.FontFormatException;

public class Main {

  public static void main(String[] args) throws Exception {
        System.out.println("Hello, World from c2vi!!!!!!");
        String fontName = "Roboto-Regular.ttf";
        String mFontDirPath = "/root/sebi/robotnix/phone-build/out/target/product/FP4/obj/ETC/recovery_font_files_intermediates";
        File fontFile = new File(mFontDirPath, fontName);
        Font result = Font.createFont(Font.TRUETYPE_FONT, fontFile);
  }

}
