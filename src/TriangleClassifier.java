public class TriangleClassifier {
    public static String triangleClassifier(int edgeA, int edgeB, int edgeC){
        String result = "";
        if ((edgeA + edgeB) > edgeC || (edgeA + edgeC) > edgeB || (edgeB + edgeC) > edgeA)
            result = "normalTriangle";

        if ((edgeA + edgeB) < edgeC || (edgeA + edgeC) < edgeB || (edgeB + edgeC) < edgeA)
            result = "notTriangles";

        if (edgeA == edgeB && edgeA == edgeC && edgeB == edgeC)
            result = "equilateralTriangle";

        else if (edgeA == edgeB || edgeA == edgeC || edgeB == edgeC)
            result = "isoscelesTriangle";

        if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0)
            result = "notTriangles";

        return result;
    }
}
