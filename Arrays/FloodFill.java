class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int oldColor = image[sr][sc];
        if(oldColor == newColor)
            return image;
        filIt(image, sr, sc, oldColor, newColor);
        return image;
    }
    
    
    public void filIt(int[][] image, int sr, int sc, int oldColor, int newColor)
    {
        image[sr][sc] = newColor;
        if(sr>0 && image[sr-1][sc]==oldColor)
            filIt(image, sr-1, sc, oldColor, newColor);
        if(sr<image.length-1 && image[sr+1][sc]==oldColor)
            filIt(image, sr+1, sc, oldColor, newColor);
        if(sc>0 && image[sr][sc-1]==oldColor)
            filIt(image, sr, sc-1, oldColor, newColor);
        if(sc<image[0].length-1 && image[sr][sc+1]==oldColor)
            filIt(image, sr, sc+1, oldColor, newColor);
    }
}
