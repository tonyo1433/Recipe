package com.larosa.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findView()

        mRecyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val Addrecipe = ArrayList<Recipe>()

        Addrecipe.add(Recipe("Fresh Tomato Shrimp Pasta",

                "Fresh tomatoes and spinach, fresh herbs,\n" +
                        "and fresh mozzarella combine with shrimp and fettuccine for an easy summer dinner.\n",
                "Ingredients:\n" +
                        "8 ounces dry fettuccine pasta\n" +
                        "3 cloves garlic\n" +
                        "1/2 sweet onion, cut into wedges\n" +
                        "3 tablespoons fresh oregano leaves\n" +
                        "4 tablespoons olive oil 4 medium tomatoes, chopped\n" +
                        "3 tablespoons chopped fresh basil salt and pepper to taste\n" +
                        "1 cup spinach leaves 1 pound cooked shrimp - peeled and deveined\n" +
                        "8 ounces fresh mozzarella cheese, diced",
                "Procedure :\n" +
                        "1. Bring a large pot of lightly salted water to a boil. Add the pasta, and cook for 8 minutes, or until tender. Drain.\n" +
                        "2. In the container of a food processor, combine the garlic, onion and oregano. Pulse until finely chopped. Heat the olive oil in a large skillet over medium heat. Add the onion mixture; cook and stir until fragrant and almost golden. Mix in the tomatoes, basil, salt and pepper. Simmer for about 5 minutes while the pasta is cooking, stirring occasionally.\n" +
                        "3. Mix in spinach until it wilts, then just before the pasta is done, stir in the shrimp. Cook until heated through. Toss with pasta in a large serving bowl, and mix in mozzarella cheese."))

        Addrecipe.add(Recipe("Easy Meatloaf",

                "This is a very easy and no fail recipe for meatloaf. It won't take long to make at all, and it's quite good!\n",
                "Ingredients: \n" +
                        "1 1/2 pounds ground beef\n" +
                        "1 egg\n" +
                        "1 onion, chopped\n" +
                        "1 cup milk\n" +
                        "1 cup dried bread crumbs salt and pepper to taste\n" +
                        "2 tablespoons brown sugar\n" +
                        "2 tablespoons prepared mustard\n" +
                        "1/3 cup ketchup",

                "Procedure:\n " +
                        "1. reheat oven to 350 degrees F (175 degrees C).\n" +
                        "2. In a large bowl, combine the beef, egg, onion, milk and bread OR cracker crumbs. Season with salt and pepper to taste and place in a lightly greased 5x9 inch loaf pan, OR form into a loaf and place in a lightly greased 9x13 inch baking dish.\n" +
                        "3. In a separate small bowl, combine the brown sugar, mustard and ketchup. Mix well and pour over the meatloaf.\n" +
                        "4. Bake at 350 degrees F (175 degrees C) for 1 hour."))

        Addrecipe.add(Recipe("Chicken Marsala",

                "A delicious, classic chicken dish -- lightly coated chicken breasts braised with Marsala wine and mushrooms. Easy and ideal for both a quick weeknight entree AND serving to company.",


                "Ingredients: \n  " +
                        "    1/4 cup all-purpose flour for coating \n" +
                        "        1/2 teaspoon salt \n" +
                        "        1/4 teaspoon ground black pepper \n" +
                        "        1/2 teaspoon dried oregano \n" +
                        "        4 skinless, boneless chicken breast halves - pounded \n" +
                        "        1/4 inch thick \n" +
                        "        4 tablespoons butter \n" +
                        "        4 tablespoons olive oil \n" +
                        "        1 cup sliced mushrooms \n" +
                        "        2 cup Marsala wine \n" +
                        "        4 cup cooking sherry",
                "Procedures: \n " +
                        "          1. In a shallow dish or bowl, mix together the flour, salt, pepper and oregano. Coat chicken pieces in flour mixture.\n" +
                        "           2. In a large skillet, melt butter in oil over medium heat. Place chicken in the pan, and lightly brown. Turn over chicken pieces, and add mushrooms. Pour in wine and sherry. Cover skillet; simmer chicken 10 minutes, turning once, until no longer pink and juices run clear."))

        Addrecipe.add(Recipe("Bow Ties with Sausage, Tomatoes and Cream",

                "A friend gave this recipe to me a few years back, and my family can't seem to get enough of it. It sounds strange with cream in it, but that just enhances the flavor and texture. This is a very easy recipe.",
                "Ingredients: \n " +
                        " 1 (12 ounce) package bow tie pasta \n" +
                        "        2 tablespoons olive oil 1\n" +
                        "        pound sweet Italian sausage, casings removed and crumbled \n" +
                        "        1/2 teaspoon red pepper flakes \n" +
                        "        1/2 cup diced onion \n" +
                        "        3 cloves garlic, minced \n" +
                        "        1 (28 ounce) can Italian-style plum tomatoes, drained and coarsely chopped \n" +
                        "        1 1/2 cups heavy cream \n" +
                        "        1/2 teaspoon salt \n" +
                        "        3 tablespoons minced fresh parsley",
                "Procedure :\n" +
                        "1. Bring a large pot of lightly salted water to a boil. Cook pasta in boiling water for 8 to 10 minutes, or until al dente; drain.\n" +
                        "2. Heat oil in a large, deep skillet over medium heat. Cook sausage and pepper flakes until sausage is evenly brown. Stir in onion and garlic, and cook until onion is tender. Stir in tomatoes, cream, and salt. Simmer until mixture thickens, 8 to 10 minutes.\n" +
                        "3. Stir cooked pasta into sauce, and heat through. Sprinkle with parsley."))

        Addrecipe.add(Recipe("Slow-Cooker Barbecue Ribs",

                "An easy and delicious way to prepare tender barbecued ribs without the barbecue!",
                "Ingredients: \n" +
                        "4 pounds pork baby back ribs salt and pepper to taste \n" +
                        "        2 cups ketchup \n" +
                        "        1 cup chili sauce \n" +
                        "        1/2 cup packed brown sugar \n" +
                        "        4 tablespoons vinegar \n" +
                        "        2 teaspoons dried oregano  \n" +
                        "        2 teaspoons Worcestershire sauce \n" +
                        "        1 dash hot sauce",
                "Procedure: \n" +
                        "1. Preheat oven to 400 degrees F (200 degrees C).\n" +
                        "2. Season ribs with salt and pepper. Place in a shallow baking pan. Brown in oven 15 minutes. Turn over, and brown another 15 minutes; drain fat.\n" +
                        "3. In a medium bowl, mix together the ketchup, chili sauce, brown sugar, vinegar, oregano, Worcestershire sauce, hot sauce, and salt and pepper. Place ribs in slow cooker. Pour sauce over ribs, and turn to coat.\n" +
                        "4. Cover, and cook on Low 6 to 8 hours, or until ribs are tender."))


        val adapter = Adapter(Addrecipe)

        mRecyclerView!!.adapter = adapter

        mRecyclerView!!.addItemDecoration(DividerItemDecoration(recyclerView1.getContext(), LinearLayoutManager.VERTICAL))
    }

    private fun findView() {
        mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView1) as RecyclerView
    }
}




