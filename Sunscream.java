class Sunscream {
    String brand, spfType, skinType, form, usage, packaging, origin, protectionType, fragrance, category;
    int spfValue, rating;
    double price, weight;
    boolean isWaterResistant, isDermatTested;
    String expiry, texture, size, certification;

    Sunscream(){
        this("Nivea","SPF50","All Skin","Cream","Daily","Tube","India","UV","Mild","Skincare",
             50,5,350.0,100.0,true,true,"2026","Smooth","Medium","ISO");
    }

    Sunscream(String brand,String spfType,String skinType,String form,String usage,String packaging,
              String origin,String protectionType,String fragrance,String category,int spfValue,int rating,
              double price,double weight,boolean isWaterResistant,boolean isDermatTested,
              String expiry,String texture,String size,String certification){
        this.brand=brand; this.spfType=spfType; this.skinType=skinType; this.form=form;
        this.usage=usage; this.packaging=packaging; this.origin=origin;
        this.protectionType=protectionType; this.fragrance=fragrance; this.category=category;
        this.spfValue=spfValue; this.rating=rating; this.price=price; this.weight=weight;
        this.isWaterResistant=isWaterResistant; this.isDermatTested=isDermatTested;
        this.expiry=expiry; this.texture=texture; this.size=size; this.certification=certification;
    }

    Sunscream(String brand,double price){
        this(brand,"SPF30","Oily","Gel","Daily","Bottle","India","UV","None","Skincare",
             30,4,price,80.0,true,true,"2025","Light","Small","FSSAI");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" SPF: "+spfValue+" Price: "+price);
    }
}