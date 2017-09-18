function groupingDishes(dishes) {
    let ingredientHash = {};
    let ingredientKey = [];

    for (let i = 0; i < dishes.length; i++) {
        let dish = '';
        for (let j = 0; j <dishes[i].length; j++) {
            if (j === 0) {
                dish = dishes[i][j];
                continue;
            }

            let ingredient = dishes[i][j];
            if (ingredientHash[ingredient] === undefined) {
                ingredientKey.push(ingredient);
                ingredientHash[ingredient] = [dish];
            }
            else {
                ingredientHash[ingredient].push(dish);
            }
        }
    }

    let groupedDishes = [];
    ingredientKey.sort();
    ingredientKey.forEach(function(key) {
        if (ingredientHash[key].length >= 2) {
            ingredientHash[key].sort();
            groupedDishes.push([key, ...ingredientHash[key]]);
        }
    });

    return groupedDishes;
}
