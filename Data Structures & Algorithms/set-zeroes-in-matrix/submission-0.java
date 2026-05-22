class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> r= new HashSet<>();
        HashSet<Integer> c= new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        boolean m[][]=new boolean[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if((r.contains(i)|| c.contains(j)) && m[i][j]==false){
                    matrix[i][j]=0;
                    m[i][j]=true;
                }
            }
        }
      
    }
}
