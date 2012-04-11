package com.github.axet.vget.info;

import java.util.Map;

public interface VGetInfo {

    public enum VideoQuality {
        p2304, p1080, p720, p480, p360, p270, p224
    }

    public static class VideoURL {
        public VideoQuality vq;
        public String url;

        public VideoURL(VideoQuality vq, String url) {
            this.vq = vq;
            this.url = url;
        }
    }

    public static class DownloadError extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public DownloadError(String msg) {
            super(msg);
        }
    }

    public void extract();

    public String getSource();

    public String getTitle();

    public Map<VideoQuality, String> getVideos();
}
