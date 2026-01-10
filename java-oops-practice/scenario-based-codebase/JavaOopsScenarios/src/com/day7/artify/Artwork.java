package com.day7.artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    // Licensing terms protected (encapsulation)
    protected String licensingTerms;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = "Standard License";
    }

    // Constructor with preview (optional)
    public Artwork(String title, String artist, double price,
                   String licenseType, String preview) {
        this(title, artist, price, licenseType);
    }

    protected boolean deductFromWallet(User user, double amount) {
        if (user.getWalletBalance() >= amount) {
            user.deduct(amount);
            return true;
        }
        System.out.println("Insufficient wallet balance");
        return false;
    }
}
