from itertools import permutations

class UniquePermutations:
    def __init__(self, number):
        self.number = number
    
    def get_unique_permutations(self):
        # Convert the number to a string to get the digits
        num_str = str(self.number)
        # Generate all permutations of the digits
        all_permutations = permutations(num_str)
        # Use a set to store unique permutations
        unique_permutations = set(int(''.join(p)) for p in all_permutations)
        # Sort the unique permutations for consistent output
        return sorted(unique_permutations)
    
    def print_unique_permutations(self):
        unique_permutations = self.get_unique_permutations()
        for perm in unique_permutations:
            print(perm)

# Example usage
if __name__ == "__main__":
    number = 1123
    perm = UniquePermutations(number)
    perm.print_unique_permutations()
