package com.tasty.recipesapp.UI.recipe.adapter//package com.tasty.recipesapp.ui.recipe.adapter
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.ViewGroup
//
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.tasty.recipesapp.repository.recipe.model.RecipeModel
//import com.tasty.recipesapp.ui.recipe.viewModel.RecipeListViewModel
//
//
//class RecipeListAdapter (
//    private val  recipeList : List<RecipeModel>
//    private val context:Context
//) : RecyclerView.Adapter<RecipeListAdapter.RecipeItemViewHolder>(){
//
//
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeItemViewHolder {
//        val binding = RecipeListItemBinding.inflate(LayoutInflater.from(context), parent, false)
//        return RecipeItemViewHolder(binding)
//
//    }
//
//    override fun getItemCount(): Int = recipeList.size
//
//    override fun onBindViewHolder(holder: RecipeListAdapter.RecipeItemViewHolder, position: Int) {
//        val currentRecipe =recipeList[position]
//
//
//        holder.recipeTitleView.text = currentRecipe.name
//        holder.recipeDescriptionView.text = currentRecipe.description
//    }
//
//    inner class RecipeItemViewHolder(binding: RecipeListItemBinding) : RecyclerView.ViewHolder(binding.root){
//
//        val recipeTitleView: TextView = binding.recipeItemTitleView
//        val recipeDescriptionView: TextView = binding.recipeItemDesciptionView
//    }
//
//
//}

