class Solution {
    void dfs(int[][] image, int i, int j, int newColor,int orgc){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]==newColor || image[i][j] != orgc){
            return;
        }
        image[i][j]=newColor;
        dfs(image,i-1,j,newColor,orgc);
        dfs(image,i,j+1,newColor,orgc);
        dfs(image,i+1,j,newColor,orgc);
        dfs(image,i,j-1,newColor,orgc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}