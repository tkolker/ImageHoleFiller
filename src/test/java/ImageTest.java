import org.junit.Test;

import static org.junit.Assert.*;

public class ImageTest {

     @Test
     public void testImageCtor() {

         Image image = new Image(Inputs.values16);

         assertEquals(image.getHeight(),4);
         assertEquals(image.getWidth(), 3);

         image.printImage();
     }



}