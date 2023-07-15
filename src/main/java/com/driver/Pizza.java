package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int totalPrice;

    private boolean isExtraCheesAdded;

    private boolean isExtraToppingsAdded;

    private boolean isTakeAwayAdded;

    public boolean isBillGenerated;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price=300;
        }
        else
        {
            price=400;
        }
        totalPrice=price;
        isExtraCheesAdded=false;
        isExtraToppingsAdded=false;
        isTakeAwayAdded=false;
        isBillGenerated=false;
        bill="";
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!isExtraCheesAdded )
        {
            totalPrice+=80;
            isExtraCheesAdded=true;
        }

    }

    public void addExtraToppings()
    {
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            if(isVeg){
                totalPrice+=70;
            }
            else totalPrice+=120;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        if(isTakeAwayAdded==false)
        {
            totalPrice+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            bill+="Base Price Of The Pizza: "+price;
            if(isExtraCheesAdded)
            {
                bill+="\n"+"Extra Cheese Added: "+80;
            }

            if(isExtraToppingsAdded)
            {
               if(isVeg)
               {
                   bill+="\n"+"Extra Toppings Added: "+70;
               }
               else
               {
                   bill+="\n"+"Extra Toppings Added: "+120;
               }
            }

            if(isTakeAwayAdded)
            {
                bill+="\n"+"Paperbag Added: "+20;
            }

            bill+="\n"+"Total Price: "+totalPrice+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
