package ir.hosseinstar.motionlayoutexamples

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.transition.MaterialSharedAxis
import ir.hosseinstar.motionlayoutexamples.databinding.FragmentMainBinding
import ir.hosseinstar.motionlayoutexamples.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        exitTransition = MaterialSharedAxis(MaterialSharedAxis.Z,true).apply {
            duration = 1000
        }
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        },2000)

        return binding.root
    }


}