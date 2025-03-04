package ro.utcluj.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.utcluj.demo.mapper.CategoryMapper;
import ro.utcluj.demo.model.Category;
import ro.utcluj.demo.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
