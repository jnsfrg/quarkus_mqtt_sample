package org.acme.mqtt;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

/**
 * A bean consuming data from the "prices" and "products" MQTT topic.
 */
@ApplicationScoped
public class ProductPriceConsumer {

    @Incoming("prices")
    public void processPrices(byte[] priceRaw) {
        System.out.println("Receiving price: " + new String(priceRaw));
    }

    @Incoming("products")
    public void processProducts(byte[] productRaw) {
        System.out.println("Receiving product: " + new String(productRaw));
    }
}
