package com.mthree.window_master;

/**
 * An abstraction for a Window, used to
 * Store and calculate Window properties
 */
public class Window {
    /**
     * The width of the window in feet
     */
    public float Width;
    /**
     * The height of the window in feet
     */
    public float Height;
    /**
     * The price per square foot of glass used by the Window
     */
    public double GlassPrice;
    /**
     * The price per linear foot of trim used by the Window
     */
    public double TrimPrice;
    /**
     * Constructs a new Window with a specified width and height in feet
     * @param w The width of the Window in feet
     * @param h The height of the Window in feet
     * @param glassPrice The price per square foot of glass used by the window in USD
     * @param trimPrice The price per linear foot of trim used by the window in USD
     */
    public Window(float w, float h, float glassPrice, float trimPrice) {
        Width = w;
        Height = h;
        GlassPrice = glassPrice;
        TrimPrice = trimPrice;
    }

    /**
     * Calculates the Area of the Window
     *
     * This value is calculated as Width * Height = A
     *
     * @return The Area of the Window in feet
     */
    public float GetArea() {
        return Width * Height;
    }

    /**
     * Calculates the Perimeter of the Window
     *
     * This value is calculated as 2 * (Width + Height) = P
     *
     * @return The perimeter of the Window in feet
     */
    public float GetPerimeter() {
        return 2 * (Width + Height);
    }

    /**
     * Calculates the price of the Window.
     *
     * This value is calculated as (Area * GLASS_PRICE) + (Perimeter * TRIM_PRICE) = PRICE
     *
     * @return The price of the window in USD
     */
    public double CalculatePrice() {
        return (GetArea() * GlassPrice) + (GetPerimeter() * TrimPrice);
    }

    @Override
    public String toString() {
        return String.format("Window Width = %.2f" +
                        "\nWindowHeight = %.2f" +
                        "\nWindow Area = %.2f" +
                        "\nWindowPerimeter = %.2f" +
                        "\nGlass Price = $%.2f" +
                        "\nTrim Price = $%.2f" +
                        "\nWindow Cost = %.2f",
                Width, Height, GetArea(), GetPerimeter(), GlassPrice, TrimPrice, CalculatePrice());
    }
}
