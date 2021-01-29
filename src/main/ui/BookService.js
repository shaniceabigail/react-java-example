export async function getAllBooks() {
    const response = await fetch('/books/listBooks');
    return await response.json();
}