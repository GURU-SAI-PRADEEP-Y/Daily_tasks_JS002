is_prime() {
    num=$1
    if [ "$num" -le 1 ]; then
        echo "Not Prime"
        return
    fi
    for ((i = 2; i <= num / 2; i++)); do
        if [ $((num % i)) -eq 0 ]; then
            echo "Not Prime"
            return
        fi
    done
    echo "Prime"
}

echo "==============================="
echo "Choose what you want to check:"
echo "1. Find Odd or Even numbers"
echo "2. Find Prime numbers"
echo "==============================="
echo "Enter your choice (1 or 2):"
read choice

echo "Enter the limit (check from 1 to this number):"
read limit

case $choice in
    1)
        echo "----- Odd or Even from 1 to $limit -----"
        for ((n = 1; n <= limit; n++)); do
            if [ $((n % 2)) -eq 0 ]; then
                echo "$n is Even"
            else
                echo "$n is Odd"
            fi
        done
        ;;
    2)
        echo "----- Prime numbers from 1 to $limit -----"
        for ((n = 1; n <= limit; n++)); do
            result=$(is_prime $n)
            if [ "$result" == "Prime" ]; then
                echo "$n is Prime"
            fi
        done
        ;;
    *)
        echo "Invalid choice. Please run the script again and choose 1 or 2."
        ;;
esac
