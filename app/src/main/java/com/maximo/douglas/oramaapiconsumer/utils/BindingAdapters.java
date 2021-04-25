package com.maximo.douglas.oramaapiconsumer.utils;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.maximo.douglas.oramaapiconsumer.R;

import static com.maximo.douglas.oramaapiconsumer.BuildConfig.BASE_URL;

public class BindingAdapters {

    @BindingAdapter("visibleOrGone")
    public static void visibleOrGone(View view, Boolean visible) {
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter("imageUrl")
    public static void setImageUri(ImageView imageView, String imageUrl) {
        Glide.with(imageView.getContext())
                .load(BASE_URL + imageUrl)
                .placeholder(R.drawable.ic_photo_24)
                .error(R.drawable.ic_photo_24)
                .into(imageView);
    }

}
