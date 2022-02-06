package com.qwirkle.qwirkle.tiles;

import javafx.scene.shape.*;

/**
 * Define o formato do desenho presente nos ladrilhos do jogo.
 */
public enum Shape {

    SQUARE {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(0,0);

            LineTo l1 = new LineTo(100,0);
            LineTo l2 = new LineTo(100, 100);
            LineTo l3 = new LineTo(0, 100);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, l1, l2, l3, closePath);

            return path;
        }
    },

    DIAMOND {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(50,0);

            LineTo l1 = new LineTo(100,50);
            LineTo l2 = new LineTo(50, 100);
            LineTo l3 = new LineTo(0, 50);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, l1, l2, l3, closePath);

            return path;
        }
    },

    CIRCLE {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(100,50);

            ArcTo a1 = new ArcTo(50, 50, 0, 0, 50, false, false);
            ArcTo a2 = new ArcTo(50, 50, 0, 100, 50, false, false);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, a1, a2, closePath);

            return path;
        }
    },

    CLOVER {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(25,75);

            ArcTo a1 = new ArcTo(25, 25, 0, 75, 75, false, false);
            ArcTo a2 = new ArcTo(25, 25, 0, 75, 25, false, false);
            ArcTo a3 = new ArcTo(25, 25, 0, 25, 25, false, false);
            ArcTo a4 = new ArcTo(25, 25, 0, 25, 75, false, false);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, a1, a2, a3, a4, closePath);

            return path;
        }
    },

    FOURSTAR {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(0,0);

            LineTo l1 = new LineTo(50,25);
            LineTo l2 = new LineTo(100, 0);
            LineTo l3 = new LineTo(75, 50);
            LineTo l4 = new LineTo(100, 100);
            LineTo l5 = new LineTo(50, 75);
            LineTo l6 = new LineTo(0, 100);
            LineTo l7 = new LineTo(25, 50);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, l1, l2, l3, l4, l5, l6, l7, closePath);

            return path;
        }
    },

    STAR {
        @Override
        public Path path() {

            MoveTo moveTo = new MoveTo(50,0);

            ArcTo a1 = new ArcTo(50, 50, 0, 100, 50, false, false);
            ArcTo a2 = new ArcTo(50, 50, 0, 50, 100, false, false);
            ArcTo a3 = new ArcTo(50, 50, 0, 0, 50, false, false);
            ArcTo a4 = new ArcTo(50, 50, 0, 50, 0, false, false);

            ClosePath closePath = new ClosePath();

            Path path = new Path();
            path.getElements().addAll(moveTo, a1, a2, a3, a4, closePath);

            return path;
        }
    },

    NONE {
        @Override
        public Path path() {
            return null;
        }
    };

    public abstract Path path();
}
