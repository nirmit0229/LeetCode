func sortedSquares(array []int) []int {
    
    result := make([]int, len(array))
    for i := range array{
        result[i] = array[i] * array[i]
    }
    sort.Ints(result)
	return result
    
}