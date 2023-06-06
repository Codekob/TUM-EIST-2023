package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
    private OrderController orderController;
    private AdvertisementController advertisementController;

    public ECommerceFacade() {
        orderController = new OrderController();
        advertisementController = new AdvertisementController();
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


}

