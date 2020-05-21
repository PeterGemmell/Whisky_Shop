package com.example.whiskyshop.whiskyservice.components;

import com.example.whiskyshop.whiskyservice.models.Customer;
import com.example.whiskyshop.whiskyservice.models.Order;
import com.example.whiskyshop.whiskyservice.models.Whisky;
import com.example.whiskyshop.whiskyservice.repositories.CustomerRepository;
import com.example.whiskyshop.whiskyservice.repositories.OrderRepository;
import com.example.whiskyshop.whiskyservice.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    OrderRepository orderRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Peter", "Gemmell", "PeteG", "info@thegentlemanselect.com", "Yo22");
        customerRepository.save(customer1);

        Whisky whisky1 = new Whisky("Dalwhinnie", "Winters Frost", "Highland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000267173757_T2_1024x1024@2x.jpg?v=1566857789", 12.99, 33.99,
                "Extreme conditions are responsible for shaping the signature Dalwhinnie Winter's Frost honeyed sweetness and spicy warmth.", 0, false);

        Whisky whisky2 = new Whisky("Clynelish", "14 Year Old", "Highland", "46%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281016535_T1_1024x1024@2x.jpg?v=1566574552", 12.99, 47.49,
                "Clynelish whisky has an agreeable long finish that leaves a lingering fresh-fruity flavour", 0, false);

        Whisky whisky3 = new Whisky("Diageo", "Cladach", "Highland", "57%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/cladach_1024x1024@2x.png?v=1574114856", 40.00, 156.99,
                "A gloriously pleasing and affirming whisky that captures the character of coastal malts perfectly.", 0, false);

        Whisky whisky4 = new Whisky("The Oban Bay", "The Nights Watch", "Highland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000267173795_T2_1024x1024@2x.jpg?v=1566858032", 14.99, 45.99,
                "The liquid's richness is balanced with a woody, spicy dryness that The Night's Watch could enjoy even on the coldest of nights.", 0, false);

        Whisky whisky5 = new Whisky("Blair Athol", "12 Year Old Flora and Fauna", "Highland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/blair-athol-12yo-faf_1024x1024@2x.jpg?v=1568846337", 12.99, 60.49,
                "A full, rich and spicy 12 year old single malt whisky. Slightly dry on the finish.", 0, false);

        Whisky whisky6 = new Whisky("Lagavulin", "16 Year Old", "Islands", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281005409_T1_1024x1024@2x.jpg?v=1566851884", 23.45, 60.49,
                "Aged in oak casks for at least 16 years, this much sought-after Single Malt has the massive peat-smoke flavour that's typical of southern Islay.", 0, false);

        Whisky whisky7 = new Whisky("Coal Ila", "12 Year Old", "Islands", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/caol-lia-12yo_1024x1024@2x.jpg?v=1569451369", 12.67, 45.49,
                "Fresh, sweetly fruity and smooth-bodied, Caol Ila 12 year old is the colour of pale straw.", 0, false);

        Whisky whisky8 = new Whisky("Talisker", "Skye", "Islands", "45.8%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281038094_T1_1024x1024@2x.jpg?v=1586988275", 18.52, 40.49,
                "Talisker Skye is the distillery’s ode to these appealing contrasts, with a smoky sweetness, maritime notes and a spicy edge.", 0, false);

        Whisky whisky9 = new Whisky("Lagavulin", "12 Year Old Special Release 2019", "Islands", "56.5%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/lagavulin-12-01_1024x1024@2x.jpg?v=1587504173", 19.50, 110.49,
                "A classic stripped-down ‘acoustic’ Lagavulin, pure in style and from spirit specially selected for its high peating levels.", 0, false);

        Whisky whisky10 = new Whisky("Port Ellen", "40 Year Old 9 Rogue Casks", "Islands", "50.9%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/portellen40-06_1024x1024@2x.jpg?v=1587568960", 578.92, 6.920,
                "There are only 1380 bottles available of the 9 Rogue Casks release. Authentic in colour and cask strength", 0, false);

        Whisky whisky11 = new Whisky("Cardhu", "12 Year Old", "Speyside", "40%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/cardhu_12y_1024x1024@2x.jpg?v=1566574114", 15.99, 44.49,
                "Enticing and silky smooth, this is the quintessential Cardhu. Glowing with notes of golden honey and delicate, fruity character.", 0, false);

        Whisky whisky12 = new Whisky("Cragganmore", "12 Year Old", "Speyside", "40%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281005430_T1_1024x1024@2x.jpg?v=1566855322", 17.26, 41.49,
                "A complex Speyside single malt whiskey praised for its depth and complexity.", 0, false);

        Whisky whisky13 = new Whisky("Glen Elgin", "12 Year Old", "Speyside", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281016467_T1_1024x1024@2x.jpg?v=1566855541", 18.99, 41.49,
                "Honey-sweet character, often called fruitcake in a bottle.", 0, false);

        Whisky whisky14 = new Whisky("Mortlach", "20 Year Old", "Speyside", "43.4%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/mortlach-20-03_1024x1024@2x.jpg?v=1587504560", 49.56, 205.49,
                "A selection of our very best Single Malt Scotch Whisky has been matured for a minimum of 20 years", 0, false);

        Whisky whisky15 = new Whisky("Pittyvaich", "28 Year Old", "Speyside", "52.1%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/Pittyvaich-with-box_1024x1024@2x.png?v=1574116062", 32.56, 330.49,
                "From a closed distillery, the oldest 1989 Pittyvaich yet in this series, with only 4,680 bottles available worldwide", 0, false);

        Whisky whisky16 = new Whisky("Glenkinchie", "12 Year Old", "Lowland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281021942_T1_1024x1024@2x.jpg?v=1566855571", 23.45, 42.49,
                "This Lowland Single Malt is perfect as an apéritif or at the start of a meal thanks to its fragrant, light and appetising body and taste.", 0, false);

        Whisky whisky17 = new Whisky("Caledonian", "The Cally", "Lowland", "53.3%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/the-cally-40yo-box_1024x1024@2x.png?v=1587155059", 245.35, 752.35,
                "Part of the 2015 Special Releases. Aromas of toffee popcorn, grilled pineapple and honeycomb. Toasty and oaky, but not heavy.", 0, false);

        Whisky whisky18 = new Whisky("Diageo", "Collectivum", "Lowland", "57.3%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/2017-sr-collectivum_resize-min_1024x1024@2x.png?v=1574114134", 56.23, 158.49,
                "A natural cask strength blended Malt Whisky from all twenty-eight operating single malt distilleries owned by Diageo.", 0, false);

        Whisky whisky19 = new Whisky("Glenkinchie", "Distillers Edition", "Lowland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/glen_1024x1024@2x.jpg?v=1566858982", 23.45, 65.49,
                "A secondary maturation in a specifically chosen Amontillado cask wood develops the unique flavour.", 0, false);


        Order order1 = new Order(customer1, "no");
        orderRepository.save(order1);
        order1.addWhisky(whisky1);
        order1.addWhisky(whisky2);

        orderRepository.save(order1);



    }


}
