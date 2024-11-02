package com.example.job1simpleuserprofilefetcher

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.job1simpleuserprofilefetcher.R
import com.example.job1simpleuserprofilefetcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.fetchUserProfile()

        // Optional: Observe loading states
        viewModel.user.observe(this) { user ->
            // Update UI with user data if needed
            // For example, you could update the TextViews or other UI elements here.
        }

        viewModel.error.observe(this) { errorMessage ->
            if (errorMessage != null) {
                // Handle error display, e.g., show a Toast or update a TextView
            }
        }
    }
}