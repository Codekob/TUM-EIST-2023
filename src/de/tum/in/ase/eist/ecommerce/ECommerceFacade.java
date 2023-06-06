package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
    private OrderController orderController;
    private AdvertisementController advertisementController;
    private ShippingController shippingController;

    public ECommerceFacade() {
        orderController = new OrderController();
        advertisementController = new AdvertisementController();
        shippingController = new ShippingController();
    }

    public void playAdvertisement(int ageRestriction) {
        advertisementController.playAdvertisement(ageRestriction);
    }

    public void processOrder(Order order) {
        orderController.processOrder(order);

    }

    public void processOrder(Order order, String phoneNumber) {
        orderController.processOrder(order, phoneNumber);

    }

    public void retrieveLatestOrder(int id) {
        orderController.retrieveLatestOrder(id);
    }

    public void shipOrder(Order order, String adress) {
        Shipping ship = shippingController.createShipping(adress);
        shippingController.shipOrder(order);

    }


}

