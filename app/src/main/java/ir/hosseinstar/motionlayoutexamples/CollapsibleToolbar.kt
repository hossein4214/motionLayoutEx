package ir.hosseinstar.motionlayoutexamples

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

class CollapsibleToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs:
    Int = 0
):MotionLayout(context,attrs,defStyleAttrs),AppBarLayout.OnOffsetChangedListener {
    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        progress = -verticalOffset / appBarLayout?.totalScrollRange?.toFloat()!!
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout?)?.addOnOffsetChangedListener(this)
    }
}