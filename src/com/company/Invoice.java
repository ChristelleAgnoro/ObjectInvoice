package com.company;

public class Invoice {
    String type;
    double subtotal;

    public double getDiscountPercent()
    {
        double discountPercent = 0.0;
        if (type.equalsIgnoreCase("r"))
        {
            if (subtotal >= 500)
                discountPercent = .2;
            else if (subtotal >= 250 && subtotal < 500)
                discountPercent =.15;
            else if (subtotal >= 100 && subtotal < 250)
                discountPercent =.1;
            else if (subtotal < 100)
                discountPercent =.0;
        }
        else if (type.equalsIgnoreCase("c"))
        {
            discountPercent = .2;
        }
        else
            discountPercent = .05;

        return discountPercent;
    }

    public double getDiscountAmount()
    {
        return subtotal * getDiscountPercent();
    }

    public double getTotal()
    {
        return subtotal - getDiscountAmount();
    }

    public double getSubTotal()
    {
        return subtotal;
    }

    public String GetSubTotal()
    {
        return String.valueOf(getSubTotal());
    }

    public String GetDiscountAmount()
    {
        return String.valueOf(getDiscountAmount());
    }
    public String GetDiscountPercent()
    {
        return String.valueOf(getDiscountPercent());
    }

    public String GetTotal()
    {
        return String.valueOf(getTotal());
    }
}