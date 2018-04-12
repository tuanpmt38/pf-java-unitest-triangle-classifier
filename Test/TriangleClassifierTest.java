import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifierEquilateralTriangle() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "equilateralTriangle";
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifierIsoscelesTriangle() {
        int edgeA = 2;
        int edgeB = 4;
        int edgeC = 2;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "isoscelesTriangle";
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifierNormalTriangle() {
        int edgeA = 4;
        int edgeB = 5;
        int edgeC = 3;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "normalTriangle";
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifierNotTriangles1() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "notTriangles";
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifierNotTriangles2() {
        int edgeA = 1;
        int edgeB = -1;
        int edgeC = 1;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "notTriangles";
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifierNotTriangles3() {
        int edgeA = 0;
        int edgeB = 2;
        int edgeC = 1;

        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        String expected = "notTriangles";
        assertEquals(expected, result);
    }
}