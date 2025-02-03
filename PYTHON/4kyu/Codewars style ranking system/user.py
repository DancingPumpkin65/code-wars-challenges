class User:
    RANKS = [-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8]
    
    def __init__(self):
        self.rank_index = 0  # Start at rank -8 :/
        self.progress = 0
    
    @property
    def rank(self):
        return self.RANKS[self.rank_index]
    
    def inc_progress(self, activity_rank):
        if activity_rank not in self.RANKS:
            raise ValueError("Invalid rank value")
        
        activity_index = self.RANKS.index(activity_rank)
        d = activity_index - self.rank_index
        
        if d == 0:
            self.progress += 3
        elif d == -1:
            self.progress += 1
        elif d > 0:
            self.progress += 10 * d * d
        
        self._update_rank()
    
    def _update_rank(self):
        while self.progress >= 100 and self.rank_index < len(self.RANKS) - 1:
            self.progress -= 100
            self.rank_index += 1
        if self.rank_index == len(self.RANKS) - 1:
            self.progress = 0  # No progress beyond rank 8 :)