package com.example.advweek4.view

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.advweek4.R
import com.example.advweek4.util.createNotificationChannel
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
        init {
            instance = this
        }

        companion object {
            var instance: MainActivity? = null
        }
        @SuppressLint("CheckResult")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            createNotificationChannel(this,
                NotificationManagerCompat.IMPORTANCE_DEFAULT, false,
                getString(R.string.app_name), "App notification channel.")

//            val fab = findViewById<FloatingActionButton>(R.id.FAB)
//            fab.setOnClickListener{
//                Observable.timer(5, TimeUnit.SECONDS)
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe {
//                        Log.d("Messages", "five seconds")
//                        MainActivity.showNotification(student.name.toString(),
//                            "A new notification created",
//                            R.drawable.circle)
//                    }

//        val observable = Observable.just("Hello")
//        val observer = object : Observer<String> {
//            override fun onSubscribe(d: Disposable?) {
//                Log.d("Messages", "begin subscribe")
//            }
//
//            override fun onNext(t: String?) {
//                Log.d("Messages", "data: $t")
//            }
//
//            override fun onError(e: Throwable?) {
//                Log.e("Messages", "error: ${e!!.message.toString()}")
//            }
//
//            override fun onComplete() {
//                Log.d("Messages", "complete")
//            }
//        }
//        observable
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(observer)
        }
    }