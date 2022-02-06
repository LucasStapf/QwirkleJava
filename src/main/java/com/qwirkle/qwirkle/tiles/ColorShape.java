package com.qwirkle.qwirkle.tiles;

import javafx.scene.paint.Color;

public enum ColorShape {

    RED {
        @Override
        public Color code() {
            return Color.RED;
        }
    },

    ORANGE {
        @Override
        public Color code() {
            return Color.ORANGE;
        }
    },

    YELLOW {
        @Override
        public Color code() {
            return Color.YELLOW;
        }
    },

    GREEN {
        @Override
        public Color code() {
            return Color.GREEN;
        }
    },

    BLUE {
        @Override
        public Color code() {
            return Color.BLUE;
        }
    },

    PURPLE {
        @Override
        public Color code() {
            return Color.PURPLE;
        }
    },

    TRANSPARENT {
        @Override
        public Color code() {
            return Color.TRANSPARENT;
        }
    };

    public abstract Color code();
}
