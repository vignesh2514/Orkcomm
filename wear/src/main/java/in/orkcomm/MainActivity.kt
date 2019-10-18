package `in`.orkcomm

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()


        bt_machine.setOnClickListener {
            setvalue_layout.visibility = View.GONE
            actualvalue_layout.visibility = View.GONE
            machine_layout.visibility = View.VISIBLE
        }

    }
}
