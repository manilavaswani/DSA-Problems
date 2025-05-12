`
PROBLEM STATEMENT:
Given a number n, count the numbers from 1 to n, which comprise only digits from set {1, 2, 3, 4, 5}.

Examples:

Input: n = 20
Output: 10
Explanation: The numbers whose digits are from the given set are: 1, 2, 3, 4, 5, 11, 12, 13, 14, 15.
Input: n = 100
Output: 30
`



function countNumbers(n){

    let count=0;
    for(let i=1;i<=n;i++){
        let valid = true;
        let str = i.toString();
        for(let ch of str){
            if(!['1','2','3','4','5'].includes(ch)){
                valid = false;
                break;
            }
        }
        if(valid) count++;
    }
    return count;
}

console.log(countNumbers(42));