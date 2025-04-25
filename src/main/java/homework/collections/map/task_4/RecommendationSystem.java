package homework.collections.map.task_4;

import java.util.*;

public class RecommendationSystem {

    private Map<String, List<String>> purchaseHistory; // userID -> List of productIDs
    private Map<String, Map<String, Integer>> coPurchaseMatrix; // productID -> (productID -> count)

    public RecommendationSystem(Map<String, List<String>> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
        this.coPurchaseMatrix = analyzeData();
    }

    /**
     * Анализирует историю покупок и создает матрицу совместных покупок.
     *
     * @return Map<String, Map < String, Integer>> coPurchaseMatrix
     */
    private Map<String, Map<String, Integer>> analyzeData() {
        Map<String, Map<String, Integer>> matrix = new HashMap<>();

        for (List<String> products : purchaseHistory.values()) {
            for (int i = 0; i < products.size(); i++) {
                String productA = products.get(i);

                // Инициализация Map для productA, если его еще нет
                matrix.computeIfAbsent(productA, k -> new HashMap<>());

                for (int j = i + 1; j < products.size(); j++) {
                    String productB = products.get(j);

                    // Увеличиваем счетчик совместных покупок для productA и productB
                    matrix.get(productA).merge(productB, 1, Integer::sum);

                    // Матрица симметрична, поэтому обновляем и для productB
                    matrix.computeIfAbsent(productB, k -> new HashMap<>());
                    matrix.get(productB).merge(productA, 1, Integer::sum);

                }
            }
        }
        return matrix;
    }

    /**
     * Генерирует список рекомендованных товаров для пользователя.
     *
     * @param userId ID пользователя
     * @return List<String> Список рекомендованных товаров (топ-5)
     */
    public List<String> recommend(String userId) {
        List<String> userPurchases = purchaseHistory.getOrDefault(userId, new ArrayList<>());
        Map<String, Integer> recommendations = new HashMap<>();

        // Собираем рекомендации на основе истории покупок пользователя
        for (String purchasedProduct : userPurchases) {
            Map<String, Integer> coPurchases = coPurchaseMatrix.get(purchasedProduct);

            if (coPurchases != null) {
                for (Map.Entry<String, Integer> entry : coPurchases.entrySet()) {
                    String recommendedProduct = entry.getKey();
                    Integer count = entry.getValue();

                    // Рекомендуем только товары, которые пользователь еще не покупал
                    if (!userPurchases.contains(recommendedProduct)) {
                        recommendations.merge(recommendedProduct, count, Integer::sum);
                    }
                }
            }
        }

        // Сортируем рекомендации по убыванию частоты совместных покупок
        List<Map.Entry<String, Integer>> sortedRecommendations = new ArrayList<>(recommendations.entrySet());
        sortedRecommendations.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Ограничиваем количество рекомендаций (топ-5)
        List<String> topRecommendations = new ArrayList<>();
        for (int i = 0; i < Math.min(5, sortedRecommendations.size()); i++) {
            topRecommendations.add(sortedRecommendations.get(i).getKey());
        }

        return topRecommendations;
    }

    public static void main(String[] args) {
        // Пример данных о покупках
        Map<String, List<String>> purchaseHistory = new HashMap<>();
        purchaseHistory.put("user1", Arrays.asList("productA", "productB", "productC"));
        purchaseHistory.put("user2", Arrays.asList("productB", "productD"));
        purchaseHistory.put("user3", Arrays.asList("productA", "productC", "productE"));
        purchaseHistory.put("user4", Arrays.asList("productA", "productB"));

        // Создаем систему рекомендаций
        RecommendationSystem recommendationSystem = new RecommendationSystem(purchaseHistory);

        // Генерируем рекомендации для пользователя "user4"
        List<String> recommendations = recommendationSystem.recommend("user4");

        // Выводим рекомендации
        System.out.println("Рекомендации для user4: " + recommendations);  // Вывод: Рекомендации для user4: [productC, productD]
    }
}
