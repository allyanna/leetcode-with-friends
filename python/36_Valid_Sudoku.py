
from collections import defaultdict
def isValidSudoku(board):
    cols = defaultdict(set)
    rows = defaultdict(set)
    boxs = defaultdict(set)

    for r in range(9):
        for c in range(9):
            val=board[r][c]
            if val==".":
                continue
            if val in cols or val in rows or val in boxs:
                return False
            
            else:
                rows[r].add(val)
                cols[c].add(val)
                ind=(r//3,c//3)
                boxs[ind].add(val)
    
    return True

board = [
    ["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
print(isValidSudoku(board))