package com.tasty.recipesapp.ui.recipe

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tasty.recipesapp.R
import com.tasty.recipesapp.ui.recipe.viewModel.RecipeListViewModel

class RecipesFragment : Fragment() {

    private val TAG: String? = "RecipesFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this).get(RecipeListViewModel::class.java)

        context?.let {
            viewModel.fetchRecipeData(it)}

        viewModel.recipeList.observe(viewLifecycleOwner){ recipes ->
            for(recipe in recipes){
                Log.d(TAG, "Recipe name: ${recipe.name}")
                Log.d(TAG, "Recipe description: ${recipe.description}")
                Log.d(TAG, "-----------------------------------------")
            }
        }
    }






}