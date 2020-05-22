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

        Whisky whisky1 = new Whisky("Dalwhinnie", "Winters Frost", "Highland", 56.940380, -4.237860,  "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000267173757_T2_1024x1024@2x.jpg", 12.99, 33.99, "Extreme conditions are responsible for shaping the signature Dalwhinnie Winter's Frost honeyed sweetness and spicy warmth.", 0, false);
        whiskyRepository.save(whisky1);

        Whisky whisky2 = new Whisky("Clynelish", "14 Year Old", "Highland", 58.022518, -3.870330, "46%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281016535_T1_1024x1024@2x.jpg", 12.99, 47.49, "Clynelish whisky has an agreeable long finish that leaves a lingering fresh fruity flavour.", 0, false);
        whiskyRepository.save(whisky2);

        Whisky whisky3 = new Whisky("Diageo", "Cladach", "Highland", 57.658360, -2.958570, "57%", "70cl", "https://blog.thewhiskyexchange.com/core/wp-content/uploads/2018/09/Cladach.jpg", 40.00, 156.99, "A gloriously pleasing and affirming whisky that captures the character of coastal malts perfectly.", 0, false);
        whiskyRepository.save(whisky3);

        Whisky whisky4 = new Whisky("The Oban Bay", "The Nights Watch", "Highland", 56.414989, -5.472700, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000267173795_T2_1024x1024@2x.jpg", 14.99, 45.99, "The liquids richness is balanced with a woody, spicy dryness that The Nights Watch could enjoy even on the coldest of nights.", 0, false);
        whiskyRepository.save(whisky4);

        Whisky whisky5 = new Whisky("Blair Athol", "12 Year Old Flora and Fauna", "Highland", 56.697676, -3.718592, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/blair-athol-12yo-faf_1024x1024@2x.jpg", 12.99, 60.49, "A full, rich and spicy 12 year old single malt whisky. Slightly dry on the finish.", 0, false);
        whiskyRepository.save(whisky5);

        Whisky whisky6 = new Whisky("Lagavulin", "16 Year Old", "Islands", 55.635575, -6.126628, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281005409_T1_1024x1024@2x.jpg", 23.45, 60.49, "Aged in oak casks for at least 16 years, this much sought after Single Malt has the massive peat smoke flavour thats typical of southern Islay.", 0, false);
        whiskyRepository.save(whisky6);

        Whisky whisky7 = new Whisky("Coal Ila", "12 Year Old", "Islands", 55.854714, -6.109647, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/caol-lia-12yo_1024x1024@2x.jpg", 12.67, 45.49, "Fresh, sweetly fruity and smooth bodied, Caol Ila 12 year old is the colour of pale straw.", 0, false);
        whiskyRepository.save(whisky7);

        Whisky whisky8 = new Whisky("Talisker", "Skye", "Islands", 57.300961, -6.352421, "45.8%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281038094_T1_1024x1024@2x.jpg", 18.52, 40.49, "Talisker Skye is the brands ode to these appealing contrasts, with a smoky sweetness, maritime notes and a spicy edge.", 0, false);
        whiskyRepository.save(whisky8);

        Whisky whisky9 = new Whisky("Lagavulin", "12 Year Old Special Release 2019", "Islands", 55.635575, -6.126628, "56.5%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/lagavulin-12-01_1024x1024@2x.jpg", 19.50, 110.49, "A classic stripped down acoustic Lagavulin, pure in style and from spirit specially selected for its high peating levels.", 0, false);
        whiskyRepository.save(whisky9);

        Whisky whisky10 = new Whisky("Port Ellen", "40 Year Old 9 Rogue Casks", "Islands", 55.633495, -6.197028, "50.9%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/portellen40-06_1024x1024@2x.jpg", 578.92, 6.920, "There are only 1380 bottles available of the 9 Rogue Casks release. Authentic in colour and cask strength", 0, false);
        whiskyRepository.save(whisky10);

        Whisky whisky11 = new Whisky("Cardhu", "12 Year Old", "Speyside", 57.470347, -3.356113, "40%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/cardhu_12y_1024x1024@2x.jpg", 15.99, 44.49, "Enticing and silky smooth, this is the quintessential Cardhu. Glowing with notes of golden honey and delicate, fruity character.", 0, false);
        whiskyRepository.save(whisky11);

        Whisky whisky12 = new Whisky("Cragganmore", "12 Year Old", "Speyside", 57.411504, -3.38778, "40%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281005430_T1_1024x1024@2x.jpg", 17.26, 41.49, "A complex Speyside single malt whiskey praised for its depth and complexity.", 0, false);
        whiskyRepository.save(whisky12);

        Whisky whisky13 = new Whisky("Glen Elgin", "12 Year Old", "Speyside", 57.59784, -3.280708, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281016467_T1_1024x1024@2x.jpg", 18.99, 41.49, "Honey sweet character, often called fruitcake in a bottle.", 0, false);
        whiskyRepository.save(whisky13);

        Whisky whisky14 = new Whisky("Mortlach", "20 Year Old", "Speyside", 57.443894, -3.119074, "43.4%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/mortlach-20-03_1024x1024@2x.jpg", 49.56, 205.49, "A selection of our very best Single Malt Scotch Whisky has been matured for a minimum of 20 years.", 0, false);
        whiskyRepository.save(whisky14);

        Whisky whisky15 = new Whisky("Pittyvaich", "28 Year Old", "Speyside", 57.438149, -3.128627, "52.1%", "70cl", "https://www.gourmetencasa-tcm.com/5952-product_default/pittyvaich-28-year-old-70-cl.jpg", 32.56, 330.49, "From a closed distillery, the oldest 1989 Pittyvaich yet in this series, with only 4680 bottles available worldwide.", 0, false);
        whiskyRepository.save(whisky15);

        Whisky whisky16 = new Whisky("Glenkinchie", "12 Year Old", "Lowland", 55.889988, -2.891258, "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000281021942_T1_1024x1024@2x.jpg", 23.45, 42.49, "This Lowland Single Malt is perfect as an aperitif or at the start of a meal thanks to its fragrant, light and appetising body and taste.", 0, false);
        whiskyRepository.save(whisky16);

        Whisky whisky17 = new Whisky("Caledonian", "The Cally", "Lowland", 55.945223, -3.221954, "53.3%", "70cl", "https://www.thewhiskyworld.com/images/caledonian-the-cally-1974-40-year-old-special-releases-2015-p5546-9912_image.jpg", 245.35, 752.35, "Part of the 2015 Special Releases. Aromas of toffee popcorn, grilled pineapple and honeycomb. Toasty and oaky, but not heavy.", 0, false);
        whiskyRepository.save(whisky17);

        Whisky whisky18 = new Whisky("Diageo", "Collectivum", "Lowland", 55.875073, -4.249806, "57.3%", "70cl", "https://m.hng.io/catalog/product/6/5/659908_1.jpg?io=PDP", 56.23, 158.49, "A natural cask strength blended Malt Whisky from all twenty eight operating single malt distilleries owned by Diageo.", 0, false);
        whiskyRepository.save(whisky18);

        Whisky whisky19 = new Whisky("Glenkinchie", "Distillers Edition", "Lowland", 55.889988, -2.891258,  "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/glen_1024x1024@2x.jpg", 23.45, 65.49, "A secondary maturation in a specifically chosen Amontillado cask wood develops the unique flavour.", 0, false);
        whiskyRepository.save(whisky19);


        Order order1 = new Order(customer1, "no");
        orderRepository.save(order1);
        order1.addWhisky(whisky1);
        order1.addWhisky(whisky2);

        orderRepository.save(order1);



    }


}
