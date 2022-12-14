package com.jaspreetkaur.changecolor

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() ,ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var initView: View
    lateinit var tvFrag: TextView
    lateinit var constraintLayout: ConstraintLayout
    lateinit var fragmentActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentActivity = activity as MainActivity
        fragmentActivity.activityInterface = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        initView = inflater.inflate(R.layout.fragment_1, container, false)
        tvFrag = initView.findViewById(R.id.tvFrag)
        constraintLayout = initView.findViewById(R.id.constraintLayout)
        return initView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
        override fun ActivityInterface(color:Int, i:Int) {
            tvFrag.setText("Changed Color ${i} times")
            when(color){
                0-> constraintLayout.setBackgroundResource(R.color.blue)
                1-> constraintLayout.setBackgroundResource(R.color.red)
                2-> constraintLayout.setBackgroundResource(R.color.yellow)
            }
        }

}