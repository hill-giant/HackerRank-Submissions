def single_quote
    return 'Hello World and others!'
end

def double_quote
    return "#{single_quote}"
end

def here_doc
    return <<-HERE
    Hello World and others!
    HERE
end
