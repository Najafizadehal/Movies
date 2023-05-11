package dev.Al.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
