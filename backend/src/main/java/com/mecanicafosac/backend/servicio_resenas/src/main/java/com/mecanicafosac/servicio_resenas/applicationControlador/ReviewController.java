package com.mecanicafosac.backend.servicio_resenas.src.main.java.com.mecanicafosac.servicio_resenas.applicationControlador;


import com.mecanicafosac.backend.servicio_resenas.src.main.java.com.mecanicafosac.servicio_resenas.domain.Review;
import com.mecanicafosac.backend.servicio_resenas.src.main.java.com.mecanicafosac.servicio_resenas.domain.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }
}
