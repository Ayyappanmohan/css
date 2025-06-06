public class WhatV2 extends WhatV1
{
    String version2="WV2";
    String size2="400mb";
    
    public void WhatsApp2()
    {
        System.out.println("Calling.......");
    }
    
    public static void main(String[] args) {
        WhatV1 w1=new WhatV1();
        System.out.println(w1.size1);
        System.out.println(w1.version1);
        w1.WhatsApp1();
        WhatV2 w2=new WhatV2();
        System.out.println(w2.size1);
        System.out.println(w2.size2);
        System.out.println(w2.version1);
        System.out.println(w2.version2);
        w2.WhatsApp1();
        w2.WhatsApp2();        
    }
}