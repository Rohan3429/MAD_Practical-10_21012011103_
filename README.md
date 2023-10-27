<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
<com.google.android.material.appbar.AppBarLayout
    android:id="@+id/toolbar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">


    <ListView
        android:id="@+id/listview1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    </androidx.constraintlayout.widget.ConstraintLayout>
    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fav1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/baseline_autorenew_24"
        app:fabCustomSize="70dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="56dp"
        android:layout_gravity="bottom|end"/>
</androidx.coordinatorlayout.widget.CoordinatorLayout>
