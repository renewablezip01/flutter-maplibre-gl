package com.mapbox.example
  import androidx.annotation.NonNull;
  import io.flutter.embedding.android.FlutterActivity;
  import io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode;

class MainActivity: FlutterActivity() {
    override fun getBackgroundMode(): BackgroundMode {
        return BackgroundMode.transparent;
    }
}
