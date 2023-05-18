package com.asim.onboardingscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.asim.onboardingscreen.databinding.FragmentPlaceholderBinding


class PlaceholderFragment : Fragment() {
    private var _binding: FragmentPlaceholderBinding? = null
    private val binding get() = _binding!!
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private val ARG_SECTION_NUMBER = "section_number"
    var img: ImageView? = null

    private val onBoardImages = intArrayOf(R.raw.on_board_1, R.raw.on_board_2, R.raw.on_board_3)

    private val onBoardTitle = arrayOf("Welcome UriChil", "Welcome 7Dream", "Welcome WayZ")
    private val onBoardTitleSub = arrayOf("NCT 127 as Il-I-Chil","NCT DREAM w/7Dream", "WayV means WēiShén V")
    private val onBoardImageSub = arrayOf("NCT 127 (Korean: 엔시티 127; RR: ensiti il-i-chil) is the first fixed and second overall sub-unit of the South Korean boy band NCT, formed and managed by SM Entertainment. The current lineup consists of nine active members: Taeil, Johnny, Taeyong, Yuta, Doyoung, Jaehyun, Jungwoo, Mark, and Haechan.",
        "NCT Dream (Korean: 엔시티 드림) is the third sub-unit of the South Korean boy band NCT, formed by SM Entertainment in 2016. The sub-unit debuted on August 25, 2016, with the single \"Chewing Gum\" and a lineup of seven members—Mark, Renjun, Jeno, Haechan, Jaemin, Chenle, and Jisung—whose average age was 15.6 years old.",
        "WayV (Chinese: 威神V; pinyin: WēiShén V; an initialism for We are your Vision)[5] is a Chinese boy band and the fourth overall sub-unit of the South Korean boy band NCT,[6][7] managed by SM Entertainments Chinese sub-label, Label V. The group is composed of seven members: Kun, Ten, Winwin, Lucas, Xiaojun, Hendery, and Yangyang.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlaceholderBinding.inflate(inflater, container, false)
        val rootView = binding.root


        binding.placeHolderTvTitle.text = onBoardTitle[arguments!!.getInt(ARG_SECTION_NUMBER) - 1]
        binding.placeHolderTvTitleSub.text = onBoardTitleSub[arguments!!.getInt(ARG_SECTION_NUMBER) - 1]
        binding.placeHolderLottieAnim.setAnimation(onBoardImages[arguments!!.getInt(ARG_SECTION_NUMBER) - 1])
        binding.placeHolderTvImgSub.text = onBoardImageSub[arguments!!.getInt(ARG_SECTION_NUMBER) - 1]

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(sectionNumber: Int) =
            PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}