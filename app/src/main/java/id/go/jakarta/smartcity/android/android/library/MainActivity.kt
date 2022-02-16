package id.go.jakarta.smartcity.android.android.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import id.go.jakarta.smartcity.android.library.composable_widget.HelloCompose

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      HelloCompose()
    }
  }
}