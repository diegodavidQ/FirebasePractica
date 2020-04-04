package diego.diedavq.firebasepractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the FirebaseAnalytics instance.
        val firebaseAnalytics = FirebaseAnalytics.getInstance(this)
        //register event
        val bundle = Bundle()
        bundle.putString("message","Integración de Firebase completa")
        firebaseAnalytics.logEvent("InitScreen", bundle )

    }
}
