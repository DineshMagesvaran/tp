package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;
import seedu.address.model.tag.Tag;

/**
 * Tests that a {@code Entry}'s {@code Restaurant Name} matches any of the keywords given.
 */
public class NameContainsKeywordsPredicate implements Predicate<Person> {
    private final List<String> keywords;

    public NameContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Person person) {
        StringBuilder nameRatingAddressTag = new StringBuilder(person.getName().fullName);
        nameRatingAddressTag.append(" ").append(person.getRating().value).append("/5");
        nameRatingAddressTag.append(" ").append(person.getAddress().value);
        for (Tag t: person.getTags()) {
            nameRatingAddressTag.append(" ").append(t.tagCategory.name());
        }
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(nameRatingAddressTag.toString(), keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof NameContainsKeywordsPredicate // instanceof handles nulls
                && keywords.equals(((NameContainsKeywordsPredicate) other).keywords)); // state check
    }

}
