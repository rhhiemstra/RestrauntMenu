package com.example.robert.restrauntmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] sideDish = {"Fried Mozzarella $5.99",
            "Lasagna Fritta $8.99",
            "Parmesan Zucchini Bites  $6.49",
            "Classic Shrimp Scampi Fritta $9.49",
            "Stuffed Mushrooms $7.99"
    };
    String[] sideDesc = {"Golden-fried mozzarella cheese, topped with an alfredo drizzle. Served with marinara sauce.\n860 cal., marinara 45 cal.",
            "Fried parmesan-breaded lasagna, topped with parmesan cheese and marinara sauce, with creamy alfredo.\n1,070 cal.",
            "Parmesan cheese and zucchini lightly breaded and fried, served with homemade marinara sauce.\n510 cal., marinara 45 cal.",
            "Lightly breaded and fried, tossed with garlic and a white wine butter sauce.\n580 cal.",
            "Baked with clams, parmesan, romano, mozzarella and herb breadcrumbs.\n380 cal."};


    String[] mainDish = {"Chicken Giardino $14.79",
            "Stuffed Fettuccine Alfredo with Grilled Chicken $16.99",
            "Eggplant Parmigiana $13.29",
            "Fettuccine Alfredo $12.99",
            "Chicken Alfredo $15.99"};
    String[] mainDesc = {"Grilled chicken and a medley of fresh vegetables tossed with ruffled pappardelle pasta in a light, lemon chicken herb sauce.\n600 cal.",
            "Large fettuccine pasta stuffed with Italian cheeses, topped with our homemade alfredo sauce and grilled chicken.\n2,170 cal.",
            "Lightly fried, topped with homemade marinara and melted mozzarella. Served with a side of spaghetti.\n1,060 cal.",
            "The key to Olive Garden's rich and creamy alfredo sauce is its freshness. Our chefs make it in house throughout the day with parmesan cheese, heavy cream, and garlic. Served with fettuccine pasta, and even the pickiest eaters can agree this simple Fettuccine Alfredo meal is delightful!\n1,010 cal.",
            "Not everyone knows our signature alfredo sauce is made from scratch daily. This homemade sauce combines simple, fresh ingredients like butter, cream and parmesan cheese to make a rich topping to our fettuccine pasta. Then it is topped with tender, sliced grilled chicken. Sprinkle some parsley flakes on top and buon appetito! Olive Garden's classic Chicken Alfredo is an easy and delicious choice for dinner.\n1,620 cal."};



    String[] salad = {"Our Famous House Salad $6.29",
            "Unlimited Soup, Salad & Breadsticks Combination $10.99",
            "Homemade Soups $5.99"};

    String[] saladDesc = {"Our Famous House Salad ToGo. Toss with our signature Italian dressing (served on the side).\n290 cal.",
            "Enjoy our dine-in unlimited famous house salad, choice of homemade soup, and warm garlic breadsticks.",
            "Choice of homemade soups:\n" +
                    "•Chicken & Gnocchi - A creamy soup made with roasted chicken, traditional Italian dumplings and spinach.\n" +
                    "•Pasta e Fagioli - White and red beans, ground beef, fresh tomatoes and tubetti pasta in a savory broth.\n" +
                    "•Minestrone - Fresh vegetables, beans and pasta in a light tomato broth - a vegan classic.\n" +
                    "•Zuppa Toscana - Spicy Italian sausage, fresh kale and russet potatoes in a creamy broth. Made with gluten-free ingredients.\n" +
                    "per serving, serves 2: 110 cal. - 230 cal.\n"
    };


    String[] dessert = {"Black Tie Mousse Cake $6.99",
            "Dolcini $2.79",
            "Seasonal Sicilian Cheesecake $6.49",
            "S'mores Layer Cake $6.79",
            "Warm Apple Crostata $6.49"
    };

    String[] dessertDesc = {"Rich layers of chocolate cake, dark chocolate cheesecake and creamy custard mousse.\n750 cal.",
            "Piccoli Dolci \"little dessert treats\", layered with cake, mousse, pastry creams and berries. 190 cal. - 240 cal.\nDolcini - Choose 2 $5.58\nDolcini - Choose 3 $6.99\nDolcini - Choose 4 $9.32\n Dolcini - Choose 5 $11.65",
            "Ricotta cheesecake with a shortbread cookie crust, topped with seasonal strawberry sauce.\n730 cal.",
            "Layers of vanilla-soaked ladyfingers, chocolate mousse and marshmallows, topped with graham crackers, toasted marshmallow and chocolate crunch.\n720 cal.",
            "Northern Spy apples are baked inside a crispy pastry crust within hours of harvest! Served warm and topped with vanilla ice cream and a caramel drizzle.\n630 cal."};

    String[] forSpinner = {"Side Dishes", "Main Dishes", "Salad", "Desserts"};

    int[] dinnerImgs = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5};
    int[] sideImgs = {R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5};
    int[] saladImgs = {R.drawable.ss1, R.drawable.ss2, R.drawable.ss3};
    int[] desertImgs = {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5};

    TextView rName;
    ImageView rImg;
    TextView rIng;
    TextView rPrep;
    ListView list;
    String itemArrSelecter;

    Spinner mySpinner;
    ScrollView myScroll;

    ArrayAdapter<String> listAdapterSideDish;
    ArrayAdapter<String> listAdapterMainDish;
    ArrayAdapter<String> spinnerAdapter;
    ArrayAdapter<String> listAdapterSalad;
    ArrayAdapter<String> listAdapterDesserts;
    Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myIntent = new Intent(this,Main2Activity.class );

        mySpinner = findViewById(R.id.spinner);
        list = findViewById(R.id.listView);
        spinnerAdapter=new ArrayAdapter(this, R.layout.spinner_item, forSpinner);
        mySpinner.setAdapter(spinnerAdapter);

        listAdapterSideDish = new ArrayAdapter<String>(this, R.layout.list_item, sideDish);
        listAdapterMainDish = new ArrayAdapter<String>(this, R.layout.list_item, mainDish);
        listAdapterSalad = new ArrayAdapter<String>(this, R.layout.list_item, salad);
        listAdapterDesserts = new ArrayAdapter<String>(this, R.layout.list_item, dessert);
        list.setAdapter(listAdapterSideDish);


        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        list.setAdapter(listAdapterSideDish);
                        itemArrSelecter = "side";
                        break;

                    case 1:
                        list.setAdapter(listAdapterMainDish);
                        itemArrSelecter = "main";
                        break;

                    case 2:
                        list.setAdapter(listAdapterSalad);
                        itemArrSelecter = "salad";
                        break;

                    case 3:
                        list.setAdapter(listAdapterDesserts);
                        itemArrSelecter = "desert";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              switch (itemArrSelecter){
                  case "side":
                      myIntent.putExtra("recipeName", sideDish[position]);
                      myIntent.putExtra("recipeDesc", sideDesc[position]);
                      myIntent.putExtra("recipeImg", sideImgs[position]);
                      MainActivity.this.startActivity(myIntent);
                      break;
                  case "main":
                      myIntent.putExtra("recipeName", mainDish[position]);
                      myIntent.putExtra("recipeDesc", mainDesc[position]);
                      myIntent.putExtra("recipeImg", dinnerImgs[position]);
                      MainActivity.this.startActivity(myIntent);
                      break;
                  case "salad":
                      myIntent.putExtra("recipeName", salad[position]);
                      myIntent.putExtra("recipeDesc", saladDesc[position]);
                      myIntent.putExtra("recipeImg", saladImgs[position]);
                      MainActivity.this.startActivity(myIntent);
                      break;
                  case "desert":
                      myIntent.putExtra("recipeName", dessert[position]);
                      myIntent.putExtra("recipeDesc", dessertDesc[position]);
                      myIntent.putExtra("recipeImg", desertImgs[position]);
                      MainActivity.this.startActivity(myIntent);
                      break;
              }

            }
        });
    }
}
