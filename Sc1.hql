select explode(ngrams(sentences(lower(tag)),4,5)) as bigrams from tags t join ratings r on(t.movieId=r.movieId) where rating<2.5;
