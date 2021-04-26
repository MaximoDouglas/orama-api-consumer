package com.maximo.douglas.oramaapiconsumer.testutils;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

public class FileUtils {
    @NotNull
    public static final FileUtils INSTANCE;

    private FileUtils() {}

    static {
        INSTANCE = new FileUtils();
    }

    @JvmStatic
    @NotNull
    public static String getJsonFromFilePath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ClassLoader classLoader = INSTANCE.getClass().getClassLoader();

        URL url = classLoader != null ? classLoader.getResource(path) : null;
        byte[] bytes = url != null ? TextStreamsKt.readBytes(url) : null;

        Intrinsics.checkNotNull(bytes);
        return new String(bytes, Charsets.UTF_8);
    }

    public static BufferedSource getImageFromFilePath(String path) {
        try {
            Source jpgSource = Okio.source(new File(path));
            return Okio.buffer(jpgSource);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
